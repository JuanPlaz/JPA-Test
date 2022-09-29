$(document).ready(function(){
alert("SE está corriendo")

function consultarClientes(){
    $.ajax({
       url: "http://localhost:8080/cliente",
        type: "GET",
        dataType: "json",
        success: function (respuesta){
           console.log(respuesta)
        }
    });
}

function mostrarTabla(){
    let tabla = "<Table>";
    for(i=0; i<filas.length; i++){
        tabla += "<tr>";
        tabla += "<td>" + filas[i].documento + "</td>";
        tabla += "<td>" + filas[i].nombre + "</td>";
        tabla += "<td>" + filas[i].apellido + "</td>";
        tabla += "<td>" + filas[i].correo + "</td>";
        tabla += "<td>" + filas[i].celular + "</td>";

    }
}

consultarClientes();
});