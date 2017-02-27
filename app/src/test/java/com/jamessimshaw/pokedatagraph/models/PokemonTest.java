package com.jamessimshaw.pokedatagraph.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by james on 2/25/17.
 */
public class PokemonTest {
    private Pokemon mPokemon;

    @Before
    public void setUp() throws Exception {
        mPokemon = new Pokemon(1, "Bulbasaur", "Grass", "Poison", 318, 45, 49, 49, 65, 65, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped");
    }

    @Test
    public void testGetID() throws Exception {
        assertEquals(mPokemon.getID(), 1);
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(mPokemon.getName(), "Bulbasaur");
    }

    @Test
    public void testGetType1() throws Exception {
        assertEquals(mPokemon.getType1(), "Grass");
    }

    @Test
    public void testGetType2() throws Exception {
        assertEquals(mPokemon.getType2(), "Poison");
    }

    @Test
    public void testGetTotalStats() throws Exception {
        assertEquals(mPokemon.getTotalStats(), 318);
    }

    @Test
    public void testGetHP() throws Exception {
        assertEquals(mPokemon.getHP(), 45);
    }

    @Test
    public void testGetAttack() throws Exception {
        assertEquals(mPokemon.getAttack(), 49);
    }

    @Test
    public void testGetDefense() throws Exception {
        assertEquals(mPokemon.getDefense(), 49);
    }

    @Test
    public void testGetSpecialAttack() throws Exception {
        assertEquals(mPokemon.getSpecialAttack(), 65);
    }

    @Test
    public void testGetSpecialDefense() throws Exception {
        assertEquals(mPokemon.getSpecialDefense(), 65);
    }

    @Test
    public void testGetSpeed() throws Exception {
        assertEquals(mPokemon.getSpeed(), 45);
    }

    @Test
    public void testGetGeneration() throws Exception {
        assertEquals(mPokemon.getGeneration(), 1);
    }

    @Test
    public void testGetLegendary() throws Exception {
        assertEquals(mPokemon.getLegendary(), false);
    }

    @Test
    public void testGetColor() throws Exception {
        assertEquals(mPokemon.getColor(), "Green");
    }

    @Test
    public void testGetGendered() throws Exception {
        assertEquals(mPokemon.getGendered(), true);
    }

    @Test
    public void testGetMaleOdds() throws Exception {
        assertEquals(mPokemon.getMaleOdds(), 0.875, 0);
    }

    @Test
    public void testGetEggGroup1() throws Exception {
        assertEquals(mPokemon.getEggGroup1(), "Monster");
    }

    @Test
    public void testGetEggGroup2() throws Exception {
        assertEquals(mPokemon.getEggGroup2(), "Grass");
    }

    @Test
    public void testGetMega() throws Exception {
        assertEquals(mPokemon.getMega(), false);
    }

    @Test
    public void testGetHeight() throws Exception {
        assertEquals(mPokemon.getHeight(), 0.71, 0);
    }

    @Test
    public void testGetWeight() throws Exception {
        assertEquals(mPokemon.getWeight(), 6.9, 0);
    }

    @Test
    public void testGetCatchRate() throws Exception {
        assertEquals(mPokemon.getCatchRate(), 45);
    }

    @Test
    public void testGetBodyStyle() throws Exception {
        assertEquals(mPokemon.getBodyStyle(), "quadruped");
    }

}