print("""
		Semicolon Ecommerce Checkout System
""")

value_added_tax = 7.5 / 100

customer_name = input("What is the customer's name: ")

user_items = input("what did the user buy: ")

pieces = int(input("How many pieces: "))

per_units = float(input("How much per unit: "))



total = pieces * per_units

value_added_tax = 0.075 * total

total_with_vat = total + value_added_tax


print(f"The total is: {total}")

print(f"The value added tax is: {value_added_tax}")