/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    const ans=nums.indexOf(target);
    if(ans!==-1){
        return ans;
    }else{
        return -1;
    }
};