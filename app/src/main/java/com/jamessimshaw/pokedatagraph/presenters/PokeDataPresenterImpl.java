package com.jamessimshaw.pokedatagraph.presenters;

import android.support.v4.util.ArrayMap;

import com.jamessimshaw.pokedatagraph.interactors.PokeDataInteractor;
import com.jamessimshaw.pokedatagraph.models.Pokemon;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by james on 2/27/17.
 */

public class PokeDataPresenterImpl implements PokeDataPresenter {
    private PokeDataInteractor mPokeDataInteractor;
    private ArrayList<Pokemon> mPokemon;

    public PokeDataPresenterImpl(PokeDataInteractor pokeDataInteractor) {
        mPokeDataInteractor = pokeDataInteractor;
        mPokemon = mPokeDataInteractor.getPokemon();
    }

    @Override
    public Map totalStatGrouping() {
        Map<Integer, Integer> grouping = new ArrayMap<>();
        for (Pokemon pokemon: mPokemon) {
            if (grouping.containsKey(pokemon.getTotalStats())) {
                int newValue = grouping.get(pokemon.getTotalStats()) + 1;
                grouping.put(pokemon.getTotalStats(), newValue);
            } else {
                grouping.put(pokemon.getTotalStats(), 1);
            }
        }
        return grouping;
    }
}
