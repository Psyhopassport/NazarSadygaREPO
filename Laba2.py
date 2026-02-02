import math

def calculate_u(x):
    try:
        part1 = math.log(abs(1 - x))

        numerator = math.tan(x) - (math.sin(x) ** 2)
        
        denominator = 1 - math.sqrt(math.log(x))
        
        if denominator == 0:
            return "Помилка: Ділення на нуль (знаменник дорівнює 0)"
            
        u = part1 + (numerator / denominator)
        return u

    except ValueError:
        return "Помилка: Неприпустиме значення x (перевірте область визначення ln та sqrt)"
    except ZeroDivisionError:
        return "Помилка: Ділення на нуль"

x_value = float(input("Введіть значення x: "))
result = calculate_u(x_value)

print(f"Результат u = {result}")