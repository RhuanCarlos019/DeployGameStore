package br.com.rhuan.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rhuan.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {

}
