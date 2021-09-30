package edu.kea.paintings.repository;

import edu.kea.paintings.models.Artist;
import org.springframework.data.repository.CrudRepository;

    public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
