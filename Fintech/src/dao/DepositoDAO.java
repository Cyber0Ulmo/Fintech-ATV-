package dao;

import conexao.ConexaoOracle;
import entidade.Deposito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class DepositoDAO {
    public DepositoDAO(ConexaoOracle conexao) {
		// TODO Auto-generated constructor stub
	}

	public void inserir(Deposito deposito) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "INSERT INTO t_deposito (t_meta_cd_meta, cd_depid, ds_deposito, dt_data, qt_valor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, deposito.getT_meta_cd_meta());
            stmt.setString(2, deposito.getCd_depid());
            stmt.setString(3, deposito.getDs_deposito());
            stmt.setDate(4, deposito.getDt_data() != null ? new Date(deposito.getDt_data().getTime()) : null);
            stmt.setDouble(5, deposito.getQt_valor());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }
    
    public void atualizar(Deposito deposito) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "UPDATE t_deposito SET t_meta_cd_meta = ?, ds_deposito = ?, dt_data = ?, qt_valor = ? WHERE cd_depid = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, deposito.getT_meta_cd_meta());
            stmt.setString(2, deposito.getDs_deposito());
            stmt.setDate(3, deposito.getDt_data() != null ? new Date(deposito.getDt_data().getTime()) : null);
            stmt.setDouble(4, deposito.getQt_valor());
            stmt.setString(5, deposito.getCd_depid());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }
    
    public void deletar(Deposito deposito) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "DELETE FROM t_deposito WHERE cd_depid = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, deposito.getCd_depid());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }
}
