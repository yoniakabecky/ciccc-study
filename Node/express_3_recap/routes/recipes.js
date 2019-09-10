const express = require('express');
const router = express.Router();

let Recipes = require('../models/recipes.mongo');


// get: get list -> check localhost:5000/api/recipes 
router.get('/', (req, res) => {
    Recipes.find()
    .then((recipes) => res.json(recipes))
    .catch(err => res.status(400).send('Error on getting recipes'));
});


// post: add new data, install uuid for unique id
router.post('/', (req, res) => {
    const { image_url, name } = req.body;

    const newRecipes = new Recipes({
        image_url,
        name,
    })

    // express function(promiss) to save new documant to collection
    newRecipes.save()
    .then(() => res.json('Successfully added a recipe!'))
    .catch(err => res.status(400).json({ 'msg': `Could not save recipes: ${err}` }));
});


// put: update the data
router.put('/', (req, res) => {
    const { id, image_url, name } = req.body;
    
    let queryId = { _id: id };
    let newUpdatingData = {
        name,
        image_url,
    }
 
    Recipes.findOneAndUpdate(queryId, newUpdatingData)
    .then(() => res.json('Update success!'))
    .catch(err => res.status(400).json({ 'msg': `Could not update a recipe ${err}`}));

});


// delete
router.delete('/', (req, res) => {
    const id = req.body.id;
    let queryId = { _id: id };

    Recipes.findOneAndDelete(queryId)
    .then(() => res.json('Delete success!'))
    .catch(err => res.status(400).json({ 'msg': `Could not delete a recipe ${err}`}));
});


module.exports = router;