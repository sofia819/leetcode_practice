/**
 * 1475. Final Prices With a Special Discount in a Shop
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/discuss/685390/JavaC%2B%2BPython-Stack-One-Pass
 */

 /**
 * @param {number[]} prices
 * @return {number[]}
 */
var finalPrices = function(prices) {
    const stack = []
    prices.forEach((price, index) => {
        /**
         * For each price, we are looking for the next lower price
         * If the next immediate price is lower, we apply the discount
         * Else, we add that price to the stack and wait for the next lower price
         */
        while(stack.length > 0 && price <= prices[stack[stack.length - 1]]) {
                prices[stack[stack.length - 1]] -= price
                stack.pop()
        }
        // The current price in the loop is added to the stack to look for its discount
        stack.push(index)
    })
    return prices
};