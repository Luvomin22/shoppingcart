FROM openjdk:17

WORKDIR /app

COPY ShoppingCart.java .

RUN javac ShoppingCart.java

CMD ["java", "ShoppingCart"]
