# frozen_string_literal: true

# In need of major optimisation and modularisation

def binary_search(num, newarr, current_index = 0)
  arr = Array.new(newarr)
  half_array_value = arr[arr.length / 2]
  half_index = arr.length / 2

  if num == half_array_value
    half_index + current_index
  elsif num < half_array_value
    binary_search(num, arr.shift(half_index), current_index)
  elsif num > half_array_value
    if arr.length.even?
      binary_search(num, arr.pop(half_index), (current_index + half_index))
    else
      binary_search(num, arr.pop(half_index), (current_index + half_index + 1)) if arr.length.odd?
    end
  else
    'not found'
  end
end
