class Cubo:
  
  """
  Crear la clase cubo con los atributos: ancho, alto y profundidad.
  Con un método calcular_volumen que tendrá la fórmula: volumen = ancho * altura * profundidad.
  Que el usuario ingrese los valores.
  """
  
  def __init__(self, ancho, altura, profundidad):
    self.ancho = ancho
    self.altura = altura
    self.profundidad = profundidad
    
  def calcular_volumen(self):
    return self.ancho * self.altura * self.profundidad

ancho = int(input("Digite el ancho del cubo: "))
altura = int(input("Digite la altura del cubo: "))
profundidad = int(input("Digite la profundidad del cubo: "))

cubo1 = Cubo(ancho, altura, profundidad)
print(f"El volumen del cubo es: {cubo1.calcular_volumen()}")