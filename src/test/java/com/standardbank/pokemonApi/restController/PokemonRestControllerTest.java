package com.standardbank.pokemonApi.restController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.standardbank.pokemonApi.model.JwtRequest;
import com.standardbank.pokemonApi.service.PokemonService;

@SpringBootTest
@AutoConfigureMockMvc
class PokemonRestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private PokemonService pokemonService;

	@Value(value = "${local.server.port}")
	private int port;

	@Value(value = "${local.server.host}")
	private String testHost;

	HttpMvcResponse httpMvcResponse;
	
	@BeforeEach
	void setUp() throws Exception {

		JwtRequest jwtRequest = new JwtRequest();
		jwtRequest.setUsername("pokemon");
		jwtRequest.setPassword("pikachu");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String requestJson = ow.writeValueAsString(jwtRequest);
		MvcResult result =	mvc.perform(post(testHost + ":" + port + "/auth").contentType(MediaType.APPLICATION_JSON).content(requestJson))
				.andExpect(status().isOk()).andReturn();		
		Gson gson = new Gson();
		httpMvcResponse =gson.fromJson(result.getResponse().getContentAsString(), HttpMvcResponse.class);
	
	}

	@Test
	void testGetPokemonList() throws Exception {

	mvc.perform(get(testHost + ":" + port + "/pokemon/api/v1/pokemon-list").contentType(MediaType.APPLICATION_JSON)
				.header("Authorization",
						"Bearer "+httpMvcResponse.getJwtString()))
				.andExpect(status().isOk()).andDo(print());
	}

	@Test
	void testGetPokemonByName() throws Exception {
		mvc.perform(get(testHost + ":" + port + "/pokemon").contentType(MediaType.APPLICATION_JSON)
				.header("Authorization",
						"Bearer "+httpMvcResponse.getJwtString()).param("name", "zubat"))
				.andExpect(status().isOk()).andDo(print());
	}

	@Test
	void testGetPokemonById() throws Exception {
		mvc.perform(get(testHost + ":" + port + "/pokemon-details").contentType(MediaType.APPLICATION_JSON)
				.header("Authorization",
						"Bearer "+httpMvcResponse.getJwtString()).param("id", "1"))
				.andExpect(status().isOk()).andDo(print());
	}

}
class HttpMvcResponse{
	private String jwtString;

	public String getJwtString() {
		return jwtString;
	}

	public void setJwtString(String jwtString) {
		this.jwtString = jwtString;
	}
	
}
