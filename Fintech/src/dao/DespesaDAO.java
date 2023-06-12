package dao;

import conexao.ConexaoOracle;
import entidade.Despesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class DespesaDAO {
    public DespesaDAO(ConexaoOracle conexao) {
		// TODO Auto-generated constructor stub
	}

	public void inserir(Despesa despesa) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "INSERT INTO t_despesa (t_meta_cd_meta, cd_despid, ds_despesa, dt_data, qt_valor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, despesa.getT_meta_cd_meta());
            stmt.setString(2, despesa.getCd_despid());
            stmt.setString(3, despesa.getDs_despesa());
            stmt.setDate(4, despesa.getDt_data() != null ? new Date(despesa.getDt_data().getTime()) : null);
            stmt.setDouble(5, despesa.getQt_valor());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }

    public void atualizar(Despesa despesa) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "UPDATE t_despesa SET t_meta_cd_meta = ?, ds_despesa = ?, dt_data = ?, qt_valor = ? WHERE cd_despid = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, despesa.getT_meta_cd_meta());
            stmt.setString(2, despesa.getDs_despesa());
            stmt.setDate(3, despesa.getDt_data() != null ? new Date(despesa.getDt_data().getTime()) : null);
            stmt.setDouble(4, despesa.getQt_valor());
            stmt.setString(5, despesa.getCd_despid());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }

    public void deletar(Despesa despesa) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "DELETE FROM t_despesa WHERE cd_despid = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, despesa.getCd_despid());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }
}

