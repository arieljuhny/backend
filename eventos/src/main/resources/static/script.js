let evento;

//evento = document.getElementById("evento").value;
//const url1 = 'https://api.conexaonfe.com.br/v1/eventos';
    // fetch(url1, {
    // method: 'POST',
    // headers: {
    //     'Authorization': 'ggg',
    //     'Content-Type': 'application/json'
    // }
    // })

const url2 = 'https://api.conexaonfe.com.br/v1/eventos';
    fetch(url2, {
    method: 'GET',
    headers: {
        'Authorization': 'ggg',
        'Content-Type': 'application/json'
    }
    })
    .then(response=>{
        return response.json();
    })
    .then(res=>{
        let auxiliar = res;
        // let aux = null;
        
        res.forEach(auxiliar => {
            let ev = [[auxiliar.evento]];
            console.log(ev);
        });
    // for (let i = 0; i < auxiliar.length; i++) {
    //     let ev = [auxiliar[i]];
        // let tr = document.createElement("tr");
        // document.body.appendChild(tr);
        // console.log(ev);
        // tr.innerHTML = ev.evento ;
        
        })
        
        //console.log(i);
    
    .catch(error=>{
        console.error;
    });

    function clicaBotao(){
        for(let i = 0; i<10;i++){
            let aux = document.getElementById(evento[i]);
        console.log(aux);
        }
        
    }
    
    

    //http:192.168.25.160:3000/eventos