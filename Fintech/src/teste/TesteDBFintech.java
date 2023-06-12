package teste;

import conexao.ConexaoOracle;
import dao.DepositoDAO;
import dao.DespesaDAO;
import dao.MetaUsuDAO;
import entidade.Deposito;
import entidade.Despesa;
import entidade.MetaUsu;

import java.sql.SQLException;
import java.util.Date;

public class TesteDBFintech {
    public static void main(String[] args) {
        ConexaoOracle conexao = new ConexaoOracle();

        try {
            ConexaoOracle.abrirConexao();

            // Inserindo uma meta de usuário
            MetaUsuDAO metaUsuDAO = new MetaUsuDAO(conexao);
            MetaUsu metaUsu = new MetaUsu();
            metaUsu.setCd_meta("META002");
            metaUsu.setQt_valor(3000.0);
            metaUsu.setDs_meta("Meta 2");
            metaUsu.setQt_saldo(0.0);

            metaUsuDAO.inserir(metaUsu);
            System.out.println("Meta de usuário inserida com sucesso!");

            // Inserindo uma despesa
            DespesaDAO despesaDAO = new DespesaDAO(conexao);
            Despesa despesa = new Despesa();
            despesa.setT_meta_cd_meta("META002");
            despesa.setCd_despid("DESP001");
            despesa.setDs_despesa("Despesa 1");
            despesa.setDt_data(new Date());
            despesa.setQt_valor(800.0);

            despesaDAO.inserir(despesa);
            System.out.println("Despesa inserida com sucesso!");

            // Inserindo um depósito
            DepositoDAO depositoDAO = new DepositoDAO(conexao);
            Deposito deposito = new Deposito();
            deposito.setT_meta_cd_meta("META002");
            deposito.setCd_depid("DEP001");
            deposito.setDs_deposito("Depósito 1");
            deposito.setDt_data(new Date());
            deposito.setQt_valor(500.0);

            depositoDAO.inserir(deposito);
            System.out.println("Depósito inserido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao interagir com o banco de dados: " + e.getMessage());
        } finally {
            ConexaoOracle.fecharConexao();
        }
    }
}
