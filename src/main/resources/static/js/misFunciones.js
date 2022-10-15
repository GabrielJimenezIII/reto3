
const BASE_URL = 'Http://localhost:8080'
function traerInformacionProduct(){
    $.ajax({
                url:BASE_URL + "/api/Product/all",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaProduct(respuesta);
                },
                error: function(xhr,status){
                    alert('Operacion no satisfactoria,'+ xhr.status );
                }
              }
          );
}
function pintarRespuestaProduct(items){
    $("#resultadoProduct").empty();
    let myTable="<table>";
    myTable += "<tr><th>Codigo</th><th>Nombre</th><th>Marca</th><th>Año</th><th>Descripcion</th>";
    for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].id+"</td>";
       myTable+="<td>"+items[i].name+"</td>";
       myTable+="<td>"+items[i].brand+"</td>";
       myTable+="<td>"+items[i].year+"</td>";
       myTable+="<td>"+items[i].description+"</td>";

       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultadoProduct").append(myTable);
}
function guardarInformacionProduct(){
    $("#resultadoProduct").empty();
    let myData ={brand:$("#brandProduct").val(),
        year:$("#yearProduct").val(),
        name:$("#nameProduct").val(),
        description:$("#descriptionProduct").val(),
    }
    let dataToSend = JSON.stringify(myData);
    $.ajax (
        {
            url          : BASE_URL + '/api/Product/save',
            type         : 'POST',
            data         :  dataToSend,
            datatype     :  "JSON",
            contentType  : 'application/json',
            success      :  function(respuesta){
                            alert("Inserción exitosa");
                            },
            error       :   function(xhr,status){
                                alert('Operacion no satisfactoria,'+ xhr.status );
                            }

        }
    );
}


function guardarInformacionCategoria(){

    $("#resultadoCategoy").empty();

    let myData ={name:$("#nameCategory").val(),description:$("#descriptionCategory").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax (
        {

            url          : BASE_URL + '/api/Category/save',
            type         : 'POST',
            data         :  dataToSend,
            datatype     :  "JSON",
            contentType  : 'application/json',
            success      :  function(respuesta){
                            alert("Inserción exitosa");
                            },
            error       :   function(xhr,status){
                                alert('Operacion no satisfactoria,'+ xhr.status );
                            }

        }
    );
}
function traerInformacionCategory(){
    $.ajax(
              {
                url:BASE_URL + "/api/Category/all",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaCategory(respuesta);

                },
                error       :   function(xhr,status){
                    alert('Operacion no satisfactoria,'+ xhr.status );
                }
            }
    );
}

function pintarRespuestaCategory(items){

    $("#resultadoCategory").empty();


   let myTable="<table>";
   myTable += "<tr><th>Codigo</th><th>Nombre</th><th>Descripcion</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+ items[i].id+ "</td>";
       myTable+="<td>"+ items[i].name+"</td>";
       myTable+="<td>"+ items[i].description+"</td>";
       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultadoCategory").append(myTable);
}

function traerInformacionClient(){
    $.ajax({
                url:BASE_URL + "/api/Client/all",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaClient(respuesta);
                },
                error       :   function(xhr,status){
                    alert('Operacion no satisfactoria,'+ xhr.status );
                }
              }
        );
}
function pintarRespuestaClient(items){

    $("#resultadoClient").empty();

   let myTable="<table>";
   myTable += "<tr><th>Id Cliente</th><th>Email del Cliente</th><th>Password</th><th>Nombre del Cliente</th><th>Edad del Cliente</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].idClient+"</td>";
       myTable+="<td>"+items[i].email+"</td>";
       myTable+="<td>"+items[i].password+"</td>";
       myTable+="<td>"+items[i].name+"</td>";
       myTable+="<td>"+items[i].age+"</td>";

       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultadoClient").append(myTable);
}
function guardarInformacionClient(){

    $("#resultadoClient").empty();

    let myData ={email:$("#emailClient").val(),password:$("#passwordClient").val(),name:$("#nameClient").val(),age:$("#ageClient").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax (
        {

            url          : BASE_URL + '/api/Client/save',
            type         : 'POST',
            data         :  dataToSend,
            datatype     :  "JSON",
            contentType  : 'application/json',
            success      :  function(respuesta){
                            console.log(respuesta);
                            alert("Inserción exitosa");
                            },
            error       :   function(xhr,status){
                                alert('Operacion no satisfactoria,'+ xhr.status );
                            }

        }
    );
}
function traerInformacionMessage(){
    $.ajax(
              {
                url:BASE_URL + "/api/Message/all",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaMessage(respuesta);
                },
                error       :   function(xhr,status){
                    alert('Operacion no satisfactoria,'+ xhr.status );
                }


              }

          );
}
function pintarRespuestaMessage(items){

    $("#resultadoMessage").empty();

   let myTable="<table>";
   myTable += "<tr><th>Codigo</th><th>Mensaje</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].idMessage+"</td>";
       myTable+="<td>"+items[i].messageText+"</td>";

       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultadoMessage").append(myTable);
}
function guardarInformacionMessage(){

    $("#resultadoMessage").empty();

    let myData ={messageText:$("#message").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax (
        {

            url          : BASE_URL + '/api/Message/save',
            type         : 'POST',
            data         :  dataToSend,
            datatype     :  "JSON",
            contentType  : 'application/json',
            success      :  function(respuesta){

                            alert("Inserción exitosa");
                            },
            error       :   function(xhr,status){
                                alert('Operacion no satisfactoria,'+ xhr.status );
                            }

        }
    );
}

function traerInformacionReservation(){
    $.ajax(
              {
                url:BASE_URL + "/api/Reservation/all",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaReservation(respuesta);
                },
                error       :   function(xhr,status){
                    alert('Operacion no satisfactoria,'+ xhr.status );
                }


              }

          );
}
function pintarRespuestaReservation(items){

    $("#resultadoReservation").empty();


   let myTable="<table>";
   myTable += "<tr><th>Codigo Res</th><th> Fecha Inicio</th><th>Fecha Fin</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].idReservation+"</td>";
       myTable+="<td>"+items[i].startDate+"</td>";
       myTable+="<td>"+items[i].devolutionDate+"</td>";

       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultadoReservation").append(myTable);
}
function guardarInformacionReservation(){

    $("#resultadoReservation").empty();

    let myData ={startDate:$("#startDate").val(),devolutionDate:$("#devolutionDate").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax (
        {

            url          : BASE_URL + '/api/Reservation/save',
            type         : 'POST',
            data         :  dataToSend,
            datatype     :  "JSON",
            contentType  : 'application/json',
            success      :  function(respuesta){
                            alert("Inserción exitosa");
                            },
            error       :   function(xhr,status){
                                alert('Operacion no satisfactoria,'+ xhr.status );
                            }

        }
    );
}