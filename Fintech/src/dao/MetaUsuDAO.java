package dao;

import conexao.ConexaoOracle;
import entidade.MetaUsu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MetaUsuDAO {
    public MetaUsuDAO(ConexaoOracle conexao) {
		// TODO Auto-generated constructor stub
	}

	public void inserir(MetaUsu metaUsu) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "INSERT INTO t_metausu (cd_meta, qt_valor, ds_meta, qt_saldo) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, metaUsu.getCd_meta());
            stmt.setDouble(2, metaUsu.getQt_valor());
            stmt.setString(3, metaUsu.getDs_meta());
            stmt.setDouble(4, metaUsu.getQt_saldo());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }

    public void atualizar(MetaUsu metaUsu) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "UPDATE t_metausu SET qt_valor = ?, ds_meta = ?, qt_saldo = ? WHERE cd_meta = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDouble(1, metaUsu.getQt_valor());
            stmt.setString(2, metaUsu.getDs_meta());
            stmt.setDouble(3, metaUsu.getQt_saldo());
            stmt.setString(4, metaUsu.getCd_meta());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }

    public void deletar(MetaUsu metaUsu) throws SQLException {
        Connection conexao = ConexaoOracle.abrirConexao();
        String sql = "DELETE FROM t_metausu WHERE cd_meta = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, metaUsu.getCd_meta());
            stmt.executeUpdate();
        } finally {
            conexao.close();
        }
    }
}
