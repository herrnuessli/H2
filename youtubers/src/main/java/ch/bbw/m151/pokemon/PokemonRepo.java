package ch.bbw.m151.pokemon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepo<name>
    extends JpaRepository<PokemonEntity, Integer>{
        //List<name> findByName(@Param("Bulbasaur"), @Param("Ivysaur") String name, String name2);
        List<name> findByName(@Param("Bulbasaur") String name);
        String deleteByName(@Param("Venusaur") String name);
    }

