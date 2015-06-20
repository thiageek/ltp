package control;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import database.SimulatedDatabase;

import model.Postagem;
import util.DBReader;
import util.DBWriter;
import view.TelaMostraPostagens;
import view.TelaMostraQuantidade;
import view.TelaPesquisa;
import view.TelaPrincipal;
import view.TelaRegistraPostagem;

public class ControlePostagem {

	private String arquivoPostagem = "C:\\Users\\ra21508684\\Desktop\\ninegag_db.txt";
	
	private SimulatedDatabase db;
	private DBWriter dw;
	private DBReader dr;
	private TelaPrincipal tela;
	private TelaRegistraPostagem trp;
	private TelaPesquisa tp;
	private TelaMostraPostagens tmp;
	private TelaMostraQuantidade tmq;
	
	public ControlePostagem() {	
		setDb(new SimulatedDatabase());
		setDw(new DBWriter());
		setDr(new DBReader());
		popularDatabase(this.dr.read(arquivoPostagem));
		iniciarSistema();
	}
	
	public SimulatedDatabase getDb() {
		return this.db;
	}
	
	public void setDb(SimulatedDatabase db) {
		this.db = db;
	}
	
	public DBWriter getDw() {
		return this.dw;
	}

	public void setDw(DBWriter dw) {
		this.dw = dw;
	}
	
	public DBReader getDr() {
		return this.dr;
	}

	public void setDr(DBReader documentReader) {
		this.dr = documentReader;
	}	
	
	public TelaPrincipal getTela() {
		return this.tela;
	}

	public void setTela(TelaPrincipal tela) {
		this.tela = tela;
	}

	public TelaRegistraPostagem getTrp() {
		return this.trp;
	}

	public void setTrp(TelaRegistraPostagem trp) {
		this.trp = trp;
	}

	public TelaPesquisa getTp() {
		return this.tp;
	}

	public void setTp(TelaPesquisa tp) {
		this.tp = tp;
	}

	public TelaMostraPostagens getTmp() {
		return this.tmp;
	}

	public void setTmp(TelaMostraPostagens tmp) {
		this.tmp = tmp;
	}

	public TelaMostraQuantidade getTmq() {
		return this.tmq;
	}

	public void setTmq(TelaMostraQuantidade tmq) {
		this.tmq = tmq;
	}

	private void popularDatabase(ArrayList<String> read) {
		for(String s : read) {
			Postagem p = stringToPostagem(s);
			this.db.getPostagens().add(p);
		}
	}
	
	private Postagem stringToPostagem(String postagemString) {
		String[] postagemItem = postagemString.split("#");
		Postagem postagem = new Postagem(postagemItem[0], postagemItem[1], postagemItem[2]);
		return postagem;
	}
	
	private void iniciarSistema() {
		String comando = "";
		while(!comando.equals("0")) {
			comando = exibirTelaPrincipal();
			executarComando(comando);
		}
	}
	
	private void executarComando(String comando) {
		switch (comando) {
		case "1":
			exibirTelaPostagens();
			break;
		case "2":
			exibirTelaPesquisa();
			break;
		case "3":
			exibirTelaRegistro();
			break;
		case "4":
			exibirTelaPesquisaCategoria();
			break;
		default:
			break;
		}
	}

	private String postagensToString(ArrayList<Postagem> postagens) {
		String postagensString = "";
		for(int i = 0; i < postagens.size(); i++) {
			postagensString += postagens.get(i).toString();
		}
		if(postagensString=="") {
			postagensString = "Não foram encontradas postagens.";
		}
		return postagensString;
	}
	
	private ArrayList<Postagem> pesquisaPostagens(String pesquisa) {
		ArrayList<Postagem> postagens = new ArrayList<Postagem>();
		String titulo = "";
		String conteudo = "";
		String categoria = "";
		for(int i = 0; i < getDb().getPostagens().size(); i++) {
			titulo = getDb().getPostagens().get(i).getTitulo().toLowerCase();
			conteudo = getDb().getPostagens().get(i).getConteudo().toLowerCase();
			categoria = getDb().getPostagens().get(i).getCategoria().toLowerCase();
			if(titulo.contains(pesquisa.toLowerCase()) || conteudo.contains(pesquisa.toLowerCase()) || categoria.contains(pesquisa.toLowerCase())) {
				postagens.add(getDb().getPostagens().get(i));
			}
		}
		return postagens;
	}
	
	private int pesquisaPostagensCategoria(String pesquisa) {
		int contador = 0;
		for(int i = 0; i < getDb().getPostagens().size(); i++) {
			if(getDb().getPostagens().get(i).getCategoria().equalsIgnoreCase(pesquisa)) {
				contador++;
			}
		}
		return contador;
	}
	
	private void registrarPostagem(String titulo, String conteudo, String categoria) {
		Postagem postagem = new Postagem(titulo, conteudo, categoria);
		getDb().inserirPostagem(postagem);
		getDw().write(arquivoPostagem, postagem.postagemToString());
	}
	
	public String exibirTelaPrincipal() {
		setTela(new TelaPrincipal());
		return getTela().getComando();
	}
	
	public void exibirTelaPostagens() {
		setTmp(new TelaMostraPostagens(postagensToString(getDb().getPostagens())));
	}
	
	public void exibirTelaPostagensImagem() {
		for(int i = 0; i < getDb().getPostagens().size(); i++) {
			BufferedImage imagem = null;
			try {
				imagem = ImageIO.read(new File(getDb().getPostagens().get(i).getConteudo()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JLabel imgLabel = new JLabel(new ImageIcon(imagem));
			JOptionPane.showMessageDialog(null, imgLabel, getDb().getPostagens().get(i).getTitulo(), JOptionPane.PLAIN_MESSAGE, null);
		}
	}
	
	public void exibirTelaPesquisa() {
		setTp(new TelaPesquisa("o termo"));
		ArrayList<Postagem> pesquisaPostagens = pesquisaPostagens(getTp().getPesquisa());
		String postagens = postagensToString(pesquisaPostagens);
		setTmp(new TelaMostraPostagens(postagens));
	}
	
	private void exibirTelaRegistro() {
		setTrp(new TelaRegistraPostagem());
		registrarPostagem(getTrp().getTitulo(),getTrp().getConteudo(),getTrp().getCategoria());
		setTmp(new TelaMostraPostagens("Postagem cadastrada com sucesso!"));
	}
	
	private void exibirTelaPesquisaCategoria() {
		setTp(new TelaPesquisa("a categoria"));
		int quantidade = pesquisaPostagensCategoria(getTp().getPesquisa());
		setTmq(new TelaMostraQuantidade(quantidade));
	}
	
}
