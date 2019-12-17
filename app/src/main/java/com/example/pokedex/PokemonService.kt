package com.example.pokedex
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface PokemonService {

    @GET("api/v2/pokemon/{number}")
    fun buscarPokemon(@Path("number") nomePokemon: String):
            Call<Pokemon>
}