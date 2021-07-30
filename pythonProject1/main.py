import arcade

# Constants
screenWidth = 1000
screenHeight = 650
screenTitle = "Game"


class Game(arcade.Window):

    def __init__(self):

        # Call the parent class and set up the window
        super().__init__(screenWidth, screenHeight, screenTitle)
        arcade.set_background_color(arcade.csscolor.CORNFLOWER_BLUE)

    def setup(self):
        """ Set up the game here. Call this function to restart the game. """
        pass

    def on_draw(self):
        """ Render the screen. """

        arcade.start_render()
        # Code to draw the screen goes here


def main():

    window = Game()
    window.setup()
    arcade.run()

    if __name__ == "__main__":
        main()
