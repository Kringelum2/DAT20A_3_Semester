const galleryWrapper = document.getElementById("galleries-wrapper");

fetch(baseURL + "/galleries")
    .then(response => response.json())
    .then(galleries => {
        console.log(galleries);
        galleries.map(gallery => {
            let galleryT = document.createElement("tr");

            galleryT.innerHTML = `
              
                    <td> <a href="./gallery.html?galleryId=${gallery.id}">${escapeHTML(gallery.name)}</a></td>
                    
                    <td>${escapeHTML(gallery.owner)}</td>
                    <td>${escapeHTML(gallery.location)}</td>
                    <td>${escapeHTML(gallery.squareFeet.toString())}</td>
                    <td><button onclick="deleteGallry(${gallery.id})">❌</button>    </td>
                  
            
            `;

            galleryWrapper.appendChild(galleryT);
        });

    });

function deleteGallry(galleryId) {
    console.log(galleryId);
}

