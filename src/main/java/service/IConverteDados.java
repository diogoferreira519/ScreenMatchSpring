package service;

public interface IConverteDados 
{
	public <T> T obterDados(String json, Class<T> classe);
		
}
