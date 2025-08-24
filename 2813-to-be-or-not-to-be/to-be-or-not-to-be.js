
var expect = function (val) {
    return {
        toBe: function (otherval) {
            if (val === otherval) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },

        notToBe: function (otherval) {
            if (val !== otherval) {
                return true;
            } else {
                throw new Error("Equal")
            }
        }
    }
};

