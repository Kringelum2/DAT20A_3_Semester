fetch("http://localhost:8080/artists")
    .then(response => response.json())
    .then(artists => {
        artists.map(artist => document.getElementById("featured-artists").append(artist.name + artist.age));
    });