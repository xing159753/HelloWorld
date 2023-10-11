console.log = function() {};
const { assert } = require('chai');
const fs = require('fs');
const Structured = require('structured');

const code = fs.readFileSync('main.js', 'utf8');

describe('', function () {
    it('', function() {
        let structureOne = function() {
            console.log(typeof newVariable);
            console.log(typeof newVariable);
        };

        let isMatchOne = Structured.match(code, structureOne)

        assert.isOk(isMatchOne, 'Did you call `console.log()` again with `typeof newVariable` passed in?')
    });
});