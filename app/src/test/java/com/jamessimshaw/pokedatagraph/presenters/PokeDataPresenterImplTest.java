package com.jamessimshaw.pokedatagraph.presenters;

import android.support.v4.util.ArrayMap;

import com.jamessimshaw.pokedatagraph.interactors.PokeDataInteractor;
import com.jamessimshaw.pokedatagraph.models.Pokemon;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by james on 2/27/17.
 */

public class PokeDataPresenterImplTest {

    @Mock PokeDataInteractor mPokeDataInteractor;

    private PokeDataPresenter mPokeDataPresenter;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        ArrayList<Pokemon> pokemon = new ArrayList<>();
        pokemon.add(new Pokemon(1, "Bulbasaur", "Grass", "Poison", 318, 45, 49, 49, 65, 65, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped"));
        pokemon.add(new Pokemon(2, "Bulbasaur", "Grass", "Poison", 313, 45, 49, 49, 60, 65, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped"));
        pokemon.add(new Pokemon(3, "Bulbasaur", "Grass", "Poison", 319, 45, 49, 49, 66, 65, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped"));
        pokemon.add(new Pokemon(4, "Bulbasaur", "Grass", "Poison", 318, 45, 49, 49, 65, 65, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped"));
        pokemon.add(new Pokemon(5, "Bulbasaur", "Grass", "Poison", 308, 45, 49, 49, 60, 60, 45, 1,
                false, "Green", true, 0.875, "Monster", "Grass", false, 0.71, 6.9, 45, "quadruped"));
        when(mPokeDataInteractor.getPokemon()).thenReturn(pokemon);
        mPokeDataPresenter = new PokeDataPresenterImpl(mPokeDataInteractor);
    }

    @Test
    public void testByTotalStats() throws Exception {
        Map expected = new ArrayMap();
        expected.put(318, 2);
        expected.put(313, 1);
        expected.put(319, 1);
        expected.put(308, 1);
        assertEquals(expected, mPokeDataPresenter.totalStatGrouping());
    }

}