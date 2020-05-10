from greeter import Greeter


def test_should_say_hello():
    greeter = Greeter("John Doe")
    greeting = greeter.say_hello()
    assert greeting == "Hello, John Doe!"
