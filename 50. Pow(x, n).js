/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    function calPow(x, n) {
        if (x === 0) return 0;
        if (n === 0) return 1;

        let half = calPow(x, Math.floor(Math.abs(n) / 2));
        let result = half * half;

        if (Math.abs(n) % 2 === 1) {
            result *= x;
        }

        return n > 0 ? result : 1 / result;
    }

    return calPow(x, n);
};
