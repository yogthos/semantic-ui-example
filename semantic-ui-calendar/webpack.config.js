const path = require('path');

module.exports = {
  entry: './src/index.js',
  output: {
    filename: 'semantic-ui-calendar.js',
    path: path.resolve(__dirname, '../public/vendor/js')
  }
  /*
  ,
  externals: {
    "react": "react",
    "react-dom": "react-dom",
    "semantic-ui-css": "semantic-ui-css",
    "semantic-ui-react": "semantic-ui-react"
  }
  */
};
