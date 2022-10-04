$(document).ready(function(){
alert("SE está corriendo")

///----------TRAER - GET------------------------------------------
function consultarClientes(){
    $.ajax({
       url: "http://localhost:8080/cliente",
        type: "GET",
        dataType: "json",
        success: function (respuesta){
           console.log(respuesta)
            mostrarTabla(respuesta)
        }
    });
}

function mostrarTabla(filas){
    let tabla = "<table>";
    for(i=0; i<filas.length; i++){
        tabla += "<tr>";
        tabla += "<td>" + filas[i].documento + "</td>";
        tabla += "<td>" + filas[i].nombre + "</td>";
        tabla += "<td>" + filas[i].apellido + "</td>";
        tabla += "<td>" + filas[i].correo + "</td>";
        tabla += "<td>" + filas[i].celular + "</td>";
        tabla += "</tr>";
    }
    tabla += "</table>";
    $("#contenedor").append(tabla)
}
consultarClientes();

///----------GUARDAR - POST------------------------------------------
function guardarCliente(){
    let datos = {
        documento: $("#doc").val(),
        nombre: $("#nom").val(),
        apellido: $("#ape").val(),
        correo: $("#cor").val(),
        celular: $("#cel").val()
    };

    let datosEnvio = JSON.stringify(datos);
    $.ajax({
        url: "http://localhost:8080/cliente",
        type: "POST",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON",

        success: function (respuesta){
            if(respuesta != null){
                alert("Datos Guardados");
            } else{
                alert("Los datos no se guardaron");
            }

        }
    });
}

$("#btnguardar").on('click', function (){
    alert("Funciona el boton");
    guardarCliente();
});

///----------ACTUALIZAR - PUT------------------------------------------
function actualizarCliente(){
    let datos = {
        documento: $("#doc").val(),
        nombre: $("#nom").val(),
        apellido: $("#ape").val(),
        correo: $("#cor").val(),
        celular: $("#cel").val()
    };

    let datosEnvio = JSON.stringify(datos);
    $.ajax({
        url: "http://localhost:8080/cliente",
        type: "PUT",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON",

        success: function (respuesta){
           if(respuesta != null){
               alert("Datos Actualizados");
           } else{
               alert("Los datos no se actualizaron");
               }
           }
    });
}

$("#btnactualizar").on('click', function (){
    alert("Funciona el boton");
    actualizarCliente();
    consultarClientes()
});

///----------BORRAR - DELETE------------------------------------------
function borrarCliente(){
    let datos = {
        documento: $("#doc").val(),
        nombre: $("#nom").val(),
        apellido: $("#ape").val(),
        correo: $("#cor").val(),
        celular: $("#cel").val()
    };

    let datosEnvio = JSON.stringify(datos);
    $.ajax({
        url: "http://localhost:8080/cliente",
        type: "DELETE",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON",

        success: function (respuesta){
            if(respuesta != null){
                alert("Datos Borrados");
            } else{
                alert("Los datos no se borraron");
            }
        }
    });
}

$("#btnborrar").on('click', function (){
    alert("Funciona el boton de Borrar");
    borrarCliente();
});

function buscarUnCliente(){
    let dato = $("#buscar").val()
    $.ajax({
        url: "http://localhost:8080/cliente/" + dato,
        type: "GET",
        dataType: "JSON",
        success: function (respuesta){
            console.log(respuesta)
            mostarDatos(respuesta)
        }
    });
}

$("#btnbuscar").on('click', function (){
    alert("consultar un ");
    buscarUnCliente();
    });

function mostarDatos(dat){
    let datosCli = "<form>"
    datosCli += "<input type='text' id='doc' value=" + dat.documento +">"
    datosCli += "<input type='text' id='nom' value=" + dat.nombre +">"
    datosCli += "<input type='text' id='ape' value=" + dat.apellido +">"
    datosCli += "<input type='text' id='cor' value=" + dat.correo +">"
    datosCli += "<input type='text' id='cel' value=" + dat.celular +">"
    datosCli += "<input type='button' id='btnactualizardos' value='Actualizar'>"
    datosCli += "</form>"
    $("#contenedorunregistro").append(datosCli);
}

$("#btnactualizardos").on('click', function (){
    alert("sirve segundo boton actualizar")
});


});