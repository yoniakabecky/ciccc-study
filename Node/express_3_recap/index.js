const express = require('express');
const recipes = require('./models/recipes');
const uuid = require('uuid/v1');
const mongoose = require('mongoose');
require('dotenv').config();
const app = express();


// Body-parser middleware
app.use(express.json());
app.use(express.urlencoded({ extended: false }));


// Connect to mongoDB
const ATLAS_URL = process.env.ATLAS_URL;

mongoose.connect(ATLAS_URL, { 
    useNewUrlParser: true, 
    useCreateIndex: true,
    useUnifiedTopology: true
})

const connection = mongoose.connection;
connection.once('open', () => {
    // when connection succeeds
    console.log('mongoDB Connection worked!');
})


// Routes, make file and cut n paste
app.use('/api/recipes', require('./routes/recipes'));


const PORT = process.env.PORT || 5000;
app.listen(PORT, () => console.log(`Server started at port ${PORT}`))