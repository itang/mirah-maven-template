package me.itang.mirah.mirahsample

class Fib
  def fib(a: int): int
    if a < 2
      a
    else
      fib(a - 1) + fib(a - 2)
    end
  end
  
  def bench(n: int)
    n.times do
      time_start = System.currentTimeMillis
      puts "fib(45): #{fib(45)}\nTotal time: #{System.currentTimeMillis - time_start}"
    end 
  end
end

# ? 怎么获取命令行参数
f = Fib.new
f.bench 10