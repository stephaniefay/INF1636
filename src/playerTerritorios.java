package Map;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Controle.Jogador;
import Controle.Territorio;

public class playerTerritorios {

	private JLabel alascaPlayer = new JLabel();
	private JLabel calgaryPlayer = new JLabel();
	private JLabel groelandiaPlayer = new JLabel();
	private JLabel vancouverPlayer = new JLabel();
	private JLabel quebecPlayer = new JLabel();
	private JLabel californiaPlayer = new JLabel();
	private JLabel texasPlayer = new JLabel();
	private JLabel newyorkPlayer = new JLabel();
	private JLabel mexicoPlayer = new JLabel();
	private JLabel venezuelaPlayer = new JLabel();
	
	private JLabel peruPlayer = new JLabel();
	private JLabel brasilPlayer = new JLabel();
	private JLabel argentinaPlayer = new JLabel();
	private JLabel africadosulPlayer = new JLabel();
	private JLabel angolaPlayer = new JLabel();
	private JLabel argeliaPlayer = new JLabel();
	private JLabel egitoPlayer = new JLabel();
	private JLabel nigeriaPlayer = new JLabel();
	private JLabel somaliaPlayer = new JLabel();
	private JLabel espanhaPlayer = new JLabel();
	
	private JLabel francaPlayer = new JLabel();
	private JLabel italiaPlayer = new JLabel();
	private JLabel poloniaPlayer = new JLabel();
	private JLabel reinounidoPlayer = new JLabel();
	private JLabel romeniaPlayer = new JLabel();
	private JLabel sueciaPlayer = new JLabel();
	private JLabel ucraniaPlayer = new JLabel();
	private JLabel arabiasauditaPlayer = new JLabel();
	private JLabel bangladeshPlayer = new JLabel();
	private JLabel cazaquistaoPlayer = new JLabel();
	
	private JLabel mongoliaPlayer = new JLabel();
	private JLabel chinaPlayer = new JLabel();
	private JLabel coreiadonortePlayer = new JLabel();
	private JLabel coreiadosulPlayer = new JLabel();
	private JLabel estoniaPlayer = new JLabel();
	private JLabel indiaPlayer = new JLabel();
	private JLabel iraPlayer = new JLabel();
	private JLabel iraquePlayer = new JLabel();
	private JLabel japaoPlayer = new JLabel();
	private JLabel jordaniaPlayer = new JLabel();
	
	private JLabel letoniaPlayer = new JLabel();
	private JLabel paquistaoPlayer = new JLabel();
	private JLabel russiaPlayer = new JLabel();
	private JLabel siberiaPlayer = new JLabel();
	private JLabel siriaPlayer = new JLabel();
	private JLabel tailandiaPlayer = new JLabel();
	private JLabel turquiaPlayer = new JLabel();
	private JLabel australiaPlayer = new JLabel();
	private JLabel indonesiaPlayer = new JLabel();
	private JLabel novazelandiaPlayer = new JLabel();
	
	private JLabel perthPlayer = new JLabel();

	public static List<JLabel> indices = new ArrayList<JLabel> ();
	
	{
		indices.add(alascaPlayer); //0
		indices.add(calgaryPlayer); //1
		indices.add(groelandiaPlayer); //2
		indices.add(vancouverPlayer); //3
		indices.add(quebecPlayer); //4
		indices.add(californiaPlayer); //5
		indices.add(texasPlayer); //6
		indices.add(newyorkPlayer); //7
		indices.add(mexicoPlayer); //8
		indices.add(venezuelaPlayer); //9
		
		indices.add(peruPlayer); //10
		indices.add(brasilPlayer); //11
		indices.add(argentinaPlayer); //12
		indices.add(africadosulPlayer); //13
		indices.add(angolaPlayer); //14
		indices.add(argeliaPlayer); //15
		indices.add(egitoPlayer); //16
		indices.add(nigeriaPlayer); //17
		indices.add(somaliaPlayer); //18
		indices.add(espanhaPlayer); //19
		
		indices.add(francaPlayer); //20
		indices.add(italiaPlayer); //21
		indices.add(poloniaPlayer); //22
		indices.add(reinounidoPlayer); //23
		indices.add(romeniaPlayer); //24
		indices.add(sueciaPlayer); //25
		indices.add(ucraniaPlayer); //26
		indices.add(arabiasauditaPlayer); //27
		indices.add(bangladeshPlayer); //28
		indices.add(cazaquistaoPlayer); //29
		
		indices.add(mongoliaPlayer); //30
		indices.add(chinaPlayer); //31
		indices.add(coreiadonortePlayer); //32
		indices.add(coreiadosulPlayer); //33
		indices.add(estoniaPlayer); //34
		indices.add(indiaPlayer); //35
		indices.add(iraPlayer); //36
		indices.add(iraquePlayer); //37
		indices.add(japaoPlayer); //38
		indices.add(jordaniaPlayer); //39
		
		indices.add(letoniaPlayer); //40
		indices.add(paquistaoPlayer); //41
		indices.add(russiaPlayer); //42
		indices.add(siberiaPlayer); //43
		indices.add(siriaPlayer); //44
		indices.add(tailandiaPlayer); //45
		indices.add(turquiaPlayer); //46
		indices.add(australiaPlayer); //47
		indices.add(indonesiaPlayer); //48
		indices.add(novazelandiaPlayer); //49
		
		indices.add(perthPlayer); //50
	}
	
	public playerTerritorios(JPanel mapa){
		
		List <Jogador> players = new Jogador().retListaJ();
		alascaPlayer.setBounds(115, 142, 18,15);
		alascaPlayer.setOpaque(true);
		alascaPlayer.setVisible(true);
		
		String aux2;
		aux2 = "Alasca";
		
		alascaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(alascaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2) {
					alascaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		calgaryPlayer.setBounds(225, 142, 18,15);
		calgaryPlayer.setOpaque(true);
		calgaryPlayer.setVisible(true);
		
		aux2 = "Calgary";
		
		calgaryPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(calgaryPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					calgaryPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		groelandiaPlayer.setBounds(375, 105, 18,15);
		groelandiaPlayer.setOpaque(true);
		groelandiaPlayer.setVisible(true);
		
		aux2 = "Groelândia";
		
		groelandiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(groelandiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					groelandiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		vancouverPlayer.setBounds(210, 185, 18,15);
		vancouverPlayer.setOpaque(true);
		vancouverPlayer.setVisible(true);
		aux2 = "Vancouver";
		
		vancouverPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(vancouverPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					vancouverPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		quebecPlayer.setBounds(305, 188, 18,15);
		quebecPlayer.setOpaque(true);
		quebecPlayer.setVisible(true);
		aux2 = "Québec";
		
		quebecPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(quebecPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					quebecPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		californiaPlayer.setBounds(145, 248, 18,15);
		californiaPlayer.setOpaque(true);
		californiaPlayer.setVisible(true);
		aux2 = "California";
		
		californiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(californiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					californiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		texasPlayer.setBounds(225, 222, 18,15);
		texasPlayer.setOpaque(true);
		texasPlayer.setVisible(true);
		
		aux2 = "Texas";
		texasPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(texasPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					texasPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		newyorkPlayer.setBounds(278, 258, 18,15);
		newyorkPlayer.setOpaque(true);
		newyorkPlayer.setVisible(true);
		aux2 = "Nova York";
		
		newyorkPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(newyorkPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					newyorkPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		mexicoPlayer.setBounds(180, 356, 18,15);
		mexicoPlayer.setOpaque(true);
		mexicoPlayer.setVisible(true);
		aux2 = "Mexico";
		
		mexicoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(mexicoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					mexicoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		venezuelaPlayer.setBounds(225, 427, 18,15);
		venezuelaPlayer.setOpaque(true);
		venezuelaPlayer.setVisible(true);
		aux2 = "Venezuela";
		
		venezuelaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(venezuelaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					venezuelaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		peruPlayer.setBounds(255, 483, 18,15);
		peruPlayer.setOpaque(true);
		peruPlayer.setVisible(true);
		aux2 = "Peru";
		
		peruPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(peruPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					peruPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		brasilPlayer.setBounds(322, 448, 18,15);
		brasilPlayer.setOpaque(true);
		brasilPlayer.setVisible(true);
		aux2 = "Brasil";
		
		brasilPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(brasilPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					brasilPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		argentinaPlayer.setBounds(332, 563, 18,15);
		argentinaPlayer.setOpaque(true);
		argentinaPlayer.setVisible(true);
		aux2 = "Argentina";
		
		argentinaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(argentinaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					argentinaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		africadosulPlayer.setBounds(592, 573, 18,15);
		africadosulPlayer.setOpaque(true);
		africadosulPlayer.setVisible(true);
		aux2 = "África do Sul";
		
		africadosulPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(africadosulPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					africadosulPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		angolaPlayer.setBounds(590, 500, 18,15);
		angolaPlayer.setOpaque(true);
		angolaPlayer.setVisible(true);
		aux2 = "Angola";
		
		angolaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(angolaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					angolaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		argeliaPlayer.setBounds(500, 370, 18,15);
		argeliaPlayer.setOpaque(true);
		argeliaPlayer.setVisible(true);
		aux2 = "Argélia";
		
		argeliaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(argeliaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					argeliaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		egitoPlayer.setBounds(590, 382, 18,15);
		egitoPlayer.setOpaque(true);
		egitoPlayer.setVisible(true);
		aux2 = "Egito";
		
		egitoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(egitoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					egitoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		nigeriaPlayer.setBounds(535, 420, 18,15);
		nigeriaPlayer.setOpaque(true);
		nigeriaPlayer.setVisible(true);
		
		aux2 = "Nigéria";
		nigeriaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(nigeriaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					nigeriaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		somaliaPlayer.setBounds(673, 473, 18,15);
		somaliaPlayer.setOpaque(true);
		somaliaPlayer.setVisible(true);
		aux2 = "Somália";
		
		somaliaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(somaliaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					somaliaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		espanhaPlayer.setBounds(473, 278, 18,15);
		espanhaPlayer.setOpaque(true);
		espanhaPlayer.setVisible(true);
		aux2 = "Espanha";
		
		espanhaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(espanhaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					espanhaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		

		francaPlayer.setBounds(520, 230, 18,15);
		francaPlayer.setOpaque(true);
		francaPlayer.setVisible(true);
		aux2 = "França";
		
		francaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(francaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					francaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		italiaPlayer.setBounds(560, 255, 18,15);
		italiaPlayer.setOpaque(true);
		italiaPlayer.setVisible(true);
		aux2 = "Itália";
		
		italiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(italiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					italiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		poloniaPlayer.setBounds(610, 195, 18,15);
		poloniaPlayer.setOpaque(true);
		poloniaPlayer.setVisible(true);
		aux2 = "Polônia";
		
		poloniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(poloniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					poloniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		reinounidoPlayer.setBounds(485, 170, 18,15);
		reinounidoPlayer.setOpaque(true);
		reinounidoPlayer.setVisible(true);
		aux2 = "Reino Unido";
		
		reinounidoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(reinounidoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					reinounidoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		romeniaPlayer.setBounds(625, 271, 18,15);
		romeniaPlayer.setOpaque(true);
		romeniaPlayer.setVisible(true);
		aux2 = "Romênia";
		
		romeniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(romeniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					romeniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		sueciaPlayer.setBounds(555, 145, 18,15);
		sueciaPlayer.setOpaque(true);
		sueciaPlayer.setVisible(true);
		aux2 = "Suécia";
		
		sueciaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(sueciaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					sueciaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		

		ucraniaPlayer.setBounds(663, 245, 18,15);
		ucraniaPlayer.setOpaque(true);
		ucraniaPlayer.setVisible(true);
		aux2 = "Ucrânia";
		
		ucraniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(ucraniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					ucraniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		arabiasauditaPlayer.setBounds(710, 410, 18,15);
		arabiasauditaPlayer.setOpaque(true);
		arabiasauditaPlayer.setVisible(true);
		aux2 = "Arábia Saudita";
		
		arabiasauditaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(arabiasauditaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					arabiasauditaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		bangladeshPlayer.setBounds(910, 442, 18,15);
		bangladeshPlayer.setOpaque(true);
		bangladeshPlayer.setVisible(true);
		aux2 = "Bangladesh";
		
		bangladeshPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(bangladeshPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					bangladeshPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
	
		cazaquistaoPlayer.setBounds(892, 212, 18,15);
		cazaquistaoPlayer.setOpaque(true);
		cazaquistaoPlayer.setVisible(true);
		aux2 = "Cazaquistão";
		
		cazaquistaoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(cazaquistaoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					cazaquistaoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		mongoliaPlayer.setBounds(900, 250, 18,15);
		mongoliaPlayer.setOpaque(true);
		mongoliaPlayer.setVisible(true);
		aux2 = "Mongólia";
		
		mongoliaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(mongoliaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					mongoliaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		chinaPlayer.setBounds(825, 285, 18,15);
		chinaPlayer.setOpaque(true);
		chinaPlayer.setVisible(true);
		aux2 = "China";
		
		chinaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(chinaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					chinaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		coreiadonortePlayer.setBounds(963, 305, 18,15);
		coreiadonortePlayer.setOpaque(true);
		coreiadonortePlayer.setVisible(true);
		aux2 = "Coréia do Norte";
		
		coreiadonortePlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(coreiadonortePlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					coreiadonortePlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		coreiadosulPlayer.setBounds(930, 328, 18,15);
		coreiadosulPlayer.setOpaque(true);
		coreiadosulPlayer.setVisible(true);
		aux2 = "Coréia do Sul";
		
		coreiadosulPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(coreiadosulPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					coreiadosulPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		estoniaPlayer.setBounds(703, 145, 18,15);
		estoniaPlayer.setOpaque(true);
		estoniaPlayer.setVisible(true);
		aux2 = "Estônia";
		
		estoniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(estoniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					estoniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		letoniaPlayer.setBounds(703, 188, 18,15);
		letoniaPlayer.setOpaque(true);
		letoniaPlayer.setVisible(true);
		aux2 = "Letônia";
		
		letoniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(letoniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					letoniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		indiaPlayer.setBounds(819, 380, 18,15);
		indiaPlayer.setOpaque(true);
		indiaPlayer.setVisible(true);
		aux2 = "Índia";
		
		indiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(indiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					indiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		iraPlayer.setBounds(733, 333, 18,15);
		iraPlayer.setOpaque(true);
		iraPlayer.setVisible(true);
		aux2 = "Irã";
		
		iraPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(iraPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					iraPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		iraquePlayer.setBounds(714, 360, 18,15);
		iraquePlayer.setOpaque(true);
		iraquePlayer.setVisible(true);
		aux2 = "Iraque";
		
		iraquePlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(iraquePlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					iraquePlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		japaoPlayer.setBounds(1000, 265, 18,15);
		japaoPlayer.setOpaque(true);
		japaoPlayer.setVisible(true);
		aux2 = "Japão";
		
		japaoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(japaoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					japaoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		jordaniaPlayer.setBounds(650, 335, 18,15);
		jordaniaPlayer.setOpaque(true);
		jordaniaPlayer.setVisible(true);
		aux2 = "Jordânia";
		
		jordaniaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(jordaniaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					jordaniaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		paquistaoPlayer.setBounds(788, 312, 18,15);
		paquistaoPlayer.setOpaque(true);
		paquistaoPlayer.setVisible(true);
		aux2 = "Paquistão";
		
		paquistaoPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(paquistaoPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					paquistaoPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		russiaPlayer.setBounds(820, 153, 18,15);
		russiaPlayer.setOpaque(true);
		russiaPlayer.setVisible(true);
		aux2 = "Rússia";
		
		russiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(russiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					russiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		siberiaPlayer.setBounds(936, 130, 18,15);
		siberiaPlayer.setOpaque(true);
		siberiaPlayer.setVisible(true);
		aux2 = "Sibéria";
		
		siberiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(siberiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					siberiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		siriaPlayer.setBounds(694, 282, 18,15);
		siriaPlayer.setOpaque(true);
		siriaPlayer.setVisible(true);
		aux2 = "Síria";
		
		siriaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(siriaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					siriaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		tailandiaPlayer.setBounds(963, 367, 18,15);
		tailandiaPlayer.setOpaque(true);
		tailandiaPlayer.setVisible(true);
		aux2 = "Tailândia";
		
		tailandiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(tailandiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					tailandiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		turquiaPlayer.setBounds(770, 243, 18,15);
		turquiaPlayer.setOpaque(true);
		turquiaPlayer.setVisible(true);
		aux2 = "Turquia";
		
		turquiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(turquiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					turquiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		australiaPlayer.setBounds(910, 617, 18,15);
		australiaPlayer.setOpaque(true);
		australiaPlayer.setVisible(true);
		aux2 = "Autrália";
		
		australiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(australiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					australiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		

		indonesiaPlayer.setBounds(928, 497, 18,15);
		indonesiaPlayer.setOpaque(true);
		indonesiaPlayer.setVisible(true);
		aux2 = "Indonésia";
		
		indonesiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(indonesiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					indonesiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		

		novazelandiaPlayer.setBounds(968, 663, 18,15);
		novazelandiaPlayer.setOpaque(true);
		novazelandiaPlayer.setVisible(true);
		aux2 = "Nova Zelândia";
		
		novazelandiaPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(novazelandiaPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					novazelandiaPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
		
		
		perthPlayer.setBounds(835, 583, 18,15);
		perthPlayer.setOpaque(true);
		perthPlayer.setVisible(true);
		aux2 = "Perth";
		
		perthPlayer.setBorder(new LineBorder(Color.black, 1));
		mapa.add(perthPlayer);
		for(int i=0; i<players.size(); i++){			
			for(String aux : players.get(i).retLista()){
				if(aux == aux2){
					perthPlayer.setBackground(players.get(i).retBackground());
				}
			}
		}
	}
	
	public playerTerritorios() {
		// TODO Auto-generated constructor stub
	}

	public void changeTerritorio(Territorio t, Jogador player){
		indices.get(t.retIndex()).setBackground(player.retBackground());
		
	}
	
	public void changeLabel (int pos, String valor) {
		indices.get(pos).setText(valor);
	}
	
}
