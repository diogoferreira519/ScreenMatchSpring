package br.com.didi.screenmatchspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.SerieBean;
import service.ConsumoAPI;
import service.ConverteDados;

@SpringBootApplication
public class ScreenmatchspringApplication implements CommandLineRunner{

	public static void main(String[] args) 
	{
		SpringApplication.run(ScreenmatchspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		ConsumoAPI api = new ConsumoAPI();
		String json = api.obterDados("https://www.omdbapi.com/?t=Lost&apikey=ac61fbdc");
		SerieBean bean = new ConverteDados().obterDados(json, SerieBean.class);
		
		System.out.println(bean);
	}

}
