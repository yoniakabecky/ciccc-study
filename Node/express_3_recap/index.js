const express = require('express');
const recipes = require('./models/recipes');
const uuid = require('uuid/v1');

const app = express();

// 3) Body-parser middleware
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

// 2) getting list -> check localhost:5000/api/recipes 
app.get('/api/recipes', (req, res) => {
    // res.send("Recipes List")
    // 4) make data file recipes.js import recipes
    res.json(recipes);
});

// 5) post: add new data, install uuid for unique id
app.post('/api/recipes', (req, res) => {
    const { image_url, name } = req.body;

    const newRecipes = {
        id: uuid(),
        image_url: image_url,
        name: name,
    };

    console.log(image_url, name, recipes.push(newRecipes));
    res.json(recipes);
});

// 6) put: update the data, 
app.put('/api/recipes/:id', (req, res) => {
    const { image_url, name } = req.body;
    
    // find the data of the id, 
    const updatingId = req.params.id;

    // update that object
    const index = recipes.findIndex(recipe => recipe.id === updatingId);

    recipes[index] = {
        id: updatingId,
        image_url: image_url,
        name: name,
    }

    // response = updated list
    res.json(recipes)

});

// // 7) delete,
app.delete('/api/recipes/:id', (req, res) => {
    const deleteId = req.params.id;
    const filterd = recipes.filter(recipe => recipe.id !== deleteId);

    res.json(filterd);
});


const PORT = process.env.PORT || 5000;
app.listen(PORT, () => console.log(`Server started at port ${PORT}`))