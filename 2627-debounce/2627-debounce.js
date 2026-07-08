/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
  let timer; // Persists across calls via closure

  return function(...args) {
    clearTimeout(timer); // Cancels the previous pending execution
    timer = setTimeout(() => fn(...args), t); // Sets up a new timer
  }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */
