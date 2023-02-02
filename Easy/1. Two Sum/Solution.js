const twoSum = function (nums, target)
{
    //search of all Array
    for (let i = 0; i < nums.length; i++)
    {
        for (let j = i + 1; j < nums.length; j++)
        {
            // if (nums[j] === target - nums[i])
            if(nums[i] + nums[j] === target)
            {
                return [i, j];
            }
        }
    }
    };
