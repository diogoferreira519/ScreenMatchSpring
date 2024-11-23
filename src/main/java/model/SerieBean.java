package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieBean(@JsonAlias({"Title", "tituuulo"}) String titulo,
						@JsonAlias("totalSeasons") Integer totalTemporadas,
						@JsonAlias("imdbRating")String avaliacao) 
{
	// pode colcoar um @JsonProperty tbm que ele serializa e desserializa a property
}
