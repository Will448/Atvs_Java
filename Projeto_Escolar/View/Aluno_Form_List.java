package Projeto_Escolar.View;

import Projeto_Escolar.Banco_Dados.Conexao;
import Projeto_Escolar.Controller.AlunoController;
import Projeto_Escolar.Model.Aluno;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aluno_Form_List {
    private JButton Salvar;
    private JButton Cancelar;
    private JTextField NomeTxt;
    private JTextField MatriculaTxt;
    private JTextField Dta_NascTxt;
    private JPanel Panel;
    private JButton Listar;
    private JTable Aluno_Listar;
    private JLabel Tabela_Listar;
    private JPanel Pane_Listar;
    private JProgressBar progressBar1;

    public Aluno_Form_List() {
        Salvar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {

                        Aluno aluno = new Aluno();

                        aluno.setNome(NomeTxt.getText());
                        aluno.setDt_nascimento(Dta_NascTxt.getText());
                        aluno.setMatricula(MatriculaTxt.getText());

                        NomeTxt.setText("");
                        Dta_NascTxt.setText("");
                        MatriculaTxt.setText("");

                        AlunoController alunoController = new AlunoController();

                        alunoController.salvar(aluno);
                        System.out.println("Registro inserido com sucesso!");


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
            });

        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você cancelou!");
            }
        });
        Listar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listar();
            }
        });
    }

        public void listar() {
            AlunoController alunoController = new AlunoController();
            ResultSet rs = alunoController.listar();

            Aluno_Listar.setModel(DbUtils.resultSetToTableModel(rs));
            Aluno_Listar.setTableHeader(null);
            setNomeColuna(new String[]{"ID", "Matricula", "Nome", "Data Nascimento"});
        }

        public void setNomeColuna(String[] colunas) {
            for (int i = 0; i < colunas.length; i++) {
                Aluno_Listar.getColumnModel().getColumn(i).setHeaderValue(colunas[i]);
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("TelaAlunoFormList");
            frame.setContentPane(new Aluno_Form_List().Panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
