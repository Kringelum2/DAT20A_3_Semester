package edu.kea.paintings.controllers;

import edu.kea.paintings.models.Artist;
import edu.kea.paintings.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Artists {


    @Autowired
    ArtistRepository artists;

    @GetMapping("/artists")
    public Iterable<Artist> getArtists() {
        return artists.findAll();
    }

    //Getting a artist by id
    @GetMapping("/artists/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artists.findById(id).get();
    }

    //Add's an artist using post
    @PostMapping("/artists")
    public Artist addArtist(@RequestBody Artist newArtist) {
        newArtist.setId(null);
        return artists.save(newArtist);
    }
    //Updates a artists by id
    @PutMapping("/artists/{id}")
    public String updateArtistById(@PathVariable Long id, @RequestBody Artist artistToUpdateWith){
        return artists.findById(id).map(foundArtist -> {
            foundArtist.setName(artistToUpdateWith.getName());
            foundArtist.setAge(artistToUpdateWith.getAge());
            foundArtist.setNationality(artistToUpdateWith.getNationality());
            foundArtist.setPrimaryStyle(artistToUpdateWith.getPrimaryStyle());
            foundArtist.setBirthDate(artistToUpdateWith.getBirthDate());
            foundArtist.setGender(artistToUpdateWith.getGender());
            return "Artist updated";
        }).orElse("Artist not found");
    }
    //Delete an artists by id.
    @DeleteMapping("/artists/{id}")
    public void deleteArtistById(@PathVariable Long id){
        artists.deleteById(id);
    }


}
