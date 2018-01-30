var express = require('express');
var router = express.Router();

/*
  GET

  index page
*/
router.get('/', function(req, res, next) {
  res.render('index', {
    title : global.title
  });
});


module.exports = router;
