/*
 * This file is part of kassel, licensed under the MIT License.
 *
 * Copyright (c) 2018 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.kassel.channel.message.embed;

import net.kyori.cereal.Document;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.awt.Color;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * An embed.
 */
public interface Embed extends Document {
  /**
   * Creates a new embed builder.
   *
   * @return the new embed builder
   */
  static @NonNull Builder builder() {
    return Embed0.BUILDER.create();
  }

  /**
   * Gets the title.
   *
   * @return the title
   */
  @NonNull Optional<String> title();

  /**
   * Gets the description.
   *
   * @return the description
   */
  @NonNull Optional<String> description();

  /**
   * Gets the url.
   *
   * @return the url
   */
  @NonNull Optional<String> url();

  /**
   * Gets the color.
   *
   * @return the color
   */
  @NonNull Optional<Color> color();

  /**
   * Gets the timestamp.
   *
   * @return the timestamp
   */
  @NonNull Optional<Instant> timestamp();

  /**
   * Gets the author.
   *
   * @return the author
   */
  @NonNull Optional<Author> author();

  /**
   * Gets the image.
   *
   * @return the image
   */
  @NonNull Optional<Image> image();

  /**
   * Gets the thumbnail.
   *
   * @return the thumbnail
   */
  @NonNull Optional<Thumbnail> thumbnail();

  /**
   * Gets the fields.
   *
   * @return the fields
   */
  @NonNull List<Field> fields();

  /**
   * Gets the footer.
   *
   * @return the footer
   */
  @NonNull Optional<Footer> footer();

  /**
   * An embed builder.
   */
  interface Builder {
    /**
     * Sets the title.
     *
     * @param title the title
     * @return this embed builder
     */
    @NonNull Builder title(final @Nullable String title);

    /**
     * Sets the description.
     *
     * @param description the description
     * @return this embed builder
     */
    @NonNull Builder description(final @Nullable String description);

    /**
     * Sets the url.
     *
     * @param url the url
     * @return this embed builder
     */
    @NonNull Builder url(final @Nullable String url);

    /**
     * Sets the color.
     *
     * @param color the color
     * @return this embed builder
     */
    @NonNull Builder color(final @Nullable Color color);

    /**
     * Sets the color.
     *
     * @param color the color
     * @return this embed builder
     */
    default @NonNull Builder color(final int color) {
      return this.color(new Color(color));
    }

    /**
     * Sets the timestamp.
     *
     * @param timestamp the timestamp
     * @return this embed builder
     */
    @NonNull Builder timestamp(final @Nullable Instant timestamp);

    /**
     * Sets the author name.
     *
     * @param name the author name
     * @return this embed builder
     */
    @NonNull Builder authorName(final @Nullable String name);

    /**
     * Sets the author .
     *
     * @param url the author url
     * @return this embed builder
     */
    @NonNull Builder authorUrl(final @Nullable String url);

    /**
     * Sets the author icon.
     *
     * @param icon the author icon
     * @return this embed builder
     */
    @NonNull Builder authorIcon(final @Nullable String icon);

    /**
     * Sets the image url.
     *
     * @param url the image url
     * @return this embed builder
     */
    @NonNull Builder imageUrl(final @Nullable String url);

    /**
     * Sets the thumbnail url.
     *
     * @param url the thumbnail url
     * @return this embed builder
     */
    @NonNull Builder thumbnailUrl(final @Nullable String url);

    /**
     * Adds a field.
     *
     * @param name the field name
     * @param value the field value
     * @return this embed builder
     */
    default @NonNull Builder field(final @NonNull String name, final @NonNull String value) {
      return this.field(name, value, false);
    }

    /**
     * Adds a field.
     *
     * @param name the field name
     * @param value the field value
     * @param inline whether to be an inline field
     * @return this embed builder
     */
    @NonNull Builder field(final @NonNull String name, final @NonNull String value, final boolean inline);

    /**
     * Sets the footer text.
     *
     * @param text the footer text
     * @return this embed builder
     */
    @NonNull Builder footerText(final @Nullable String text);

    /**
     * Sets the footer icon.
     *
     * @param icon the footer icon
     * @return this embed builder
     */
    @NonNull Builder footerIcon(final @Nullable String icon);

    /**
     * Builds an embed.
     *
     * @return the embed
     */
    @NonNull Embed build();
  }

  /**
   * An author.
   */
  interface Author extends Document {
    /**
     * Gets the name.
     *
     * @return the name
     */
    @NonNull Optional<String> name();

    /**
     * Gets the url.
     *
     * @return the url
     */
    @NonNull Optional<String> url();

    /**
     * Gets the icon.
     *
     * @return the icon
     */
    @NonNull Optional<String> icon();
  }

  /**
   * A field.
   */
  interface Field extends Document {
    /**
     * Gets the name.
     *
     * @return the name
     */
    @NonNull String name();

    /**
     * Gets the value.
     *
     * @return the value
     */
    @NonNull String value();

    /**
     * Gets the author icon.
     *
     * @return the author icon
     */
    boolean inline();
  }

  /**
   * An author.
   */
  interface Footer extends Document {
    /**
     * Gets the text.
     *
     * @return the text
     */
    @NonNull String text();

    /**
     * Gets the icon.
     *
     * @return the icon
     */
    @NonNull Optional<String> icon();
  }

  /**
   * An image.
   */
  interface Image extends Document {
    /**
     * Gets the url.
     *
     * @return the url
     */
    @NonNull Optional<String> url();
  }

  /**
   * A thumbnail.
   */
  interface Thumbnail extends Document {
    /**
     * Gets the url.
     *
     * @return the url
     */
    @NonNull Optional<String> url();
  }
}
