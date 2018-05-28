const express = require('express');	// import package
var bodyParser = require("body-parser");
const app = express();

//Here we are configuring express to use body-parser as middle-ware.
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.use(express.static('form'));
app.get('/', (req, res) => res.send('Hello World!')); // What a server is gonna do

app.post('/form.html', handlePostRequest);

app.listen(3000, () => console.log('Example app listening on port 3000!')); // show msg on the console

function handlePostRequest(req, res){
	console.log(req.body);
	res.send("OK");
}