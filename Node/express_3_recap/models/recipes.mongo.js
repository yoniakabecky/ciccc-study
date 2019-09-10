const mongoose = require('mongoose');
const Schema = mongoose.Schema;

// defines data types and options for data
const recipesShema = new Schema({
  image_url: { type: String, required: true },
  name: { type: String, required: true }
}, { timestamps: true })

const Recipes = mongoose.model('Recipes', recipesShema);
module.exports = Recipes;