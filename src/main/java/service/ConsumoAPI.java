package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConsumoAPI 
{
	public String obterDados(String endereco)
	{
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest req = HttpRequest
						.newBuilder(URI.create(endereco))
						.build();
		
		HttpResponse<String> res = null;
		
		try
		{
			res = client.send(req, BodyHandlers.ofString());
		}
		catch(IOException | InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		
		return res.body();
	}
}
