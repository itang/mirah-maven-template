package me.itang.mirah.mirahsample

import org.junit.Test
import org.junit.Assert

class FibTest
  $Test
  def test_fib: void
    f = Fib.new
    Assert.assertEquals(0, f.fib(0))
    Assert.assertEquals(1, f.fib(1))
    Assert.assertEquals(1, f.fib(2))
    Assert.assertEquals(2, f.fib(3))
    Assert.assertEquals(3, f.fib(4))
  end
end