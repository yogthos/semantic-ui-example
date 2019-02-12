const path = require('path');

module.exports = {
  entry: './src/index.js',
  output: {
    filename: 'semantic-ui-calendar.js',
    path: path.resolve(__dirname, '../public/vendor/js')
  },
  externals: {    
  }
};
