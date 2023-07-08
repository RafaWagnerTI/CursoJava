package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,  "Roberto"); //adiciona ou atualiza um elemento com base na chave
		usuarios.put(20, "Ricardo");
		usuarios.put(3,  "Rafaela");
		usuarios.put(4,  "Rebeca");
		
		System.out.println(usuarios.size()); // Retorna quantos elementos tem no Map
		System.out.println(usuarios.isEmpty()); //Valida se o elemento está no Map
		
		System.out.println(usuarios.keySet()); // Retorna as chaves que tem no Map
		System.out.println(usuarios.values()); // Retorna os valores que tem no Map
		System.out.println(usuarios.entrySet()); // Retorna as chaves e valores do Map
		
		System.out.println(usuarios.get(4)); // Retorna usuário por chave
		System.out.println(usuarios.remove(1)); // Remove do Map e retorna o elemento removido
		System.out.println(usuarios.remove(1, "Gui")); // Remove do Map com base na chave e valor
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " ==> " + registro.getValue());
		}
		
	}
	
}
