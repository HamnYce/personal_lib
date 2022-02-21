# Frozen_String_Literal: true

a_nums = []
b_nums = []
File.open('text.txt') do |file|
  file.readline

  until file.eof?
    vals = file.readline.split(',')
    a_nums << vals[0].to_f.round(2)
    b_nums << vals[1].to_f.round(2)
  end
end

a_nums.sort!
b_nums.sort!

def total(nums)
  nums.reduce(0, :+).round(2)
end

def mean(nums)
  total(nums) / nums.length
end

def median(nums)
  if nums.length.even?
    index_one = nums.length / 2
    index_two = (nums.length / 2) - 1
    (nums[index_one] + nums[index_two]) / 2
  else
    nums[nums.length / 2]
  end
end

def trimmed_mean(nums, percent)
  trim_per = nums * percent
  trimmed_nums = nums[2..(nums.length - trim_per - 1)]
  mean(trimmed_nums)
end

def variance(nums)
  avg = mean(nums)
  nums_minus_avg_sqr = nums.map { |x| (x - avg)**2 }
  sum_of_avg_sqr = nums_minus_avg_sqr.reduce(0, :+)
  (1.0 / (nums.length - 1)) * sum_of_avg_sqr
end

def standard_deviation(nums)
  Math.sqrt(variance(nums))
end

p mean a_nums
p mean b_nums

p median a_nums
p median b_nums

p variance a_nums
p variance b_nums

p standard_deviation a_nums
p standard_deviation b_nums
