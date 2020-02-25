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
package net.kyori.kassel.guild.role;

import java.awt.Color;
import net.kyori.kassel.Mentionable;
import net.kyori.kassel.Named;
import net.kyori.kassel.snowflake.Snowflaked;
import net.kyori.mu.Maybe;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A role.
 */
public interface Role extends Mentionable, Named, Snowflaked {
  /**
   * Gets the color.
   *
   * @return the color
   */
  @NonNull Maybe<Color> color();

  /**
   * Checks if this role is mentionable.
   *
   * @return {@code true} if mentionable, {@code false} otherwise
   */
  boolean mentionable();

  @Override
  default @NonNull String mention() {
    return "<@&" + this.id() + ">";
  }

  /**
   * Checks if this role is managed by an integration.
   *
   * @return {@code true} if managed by an integration, {@code false} otherwise
   */
  boolean managed();

  /**
   * Checks if this role is hoisted.
   *
   * @return {@code true} if hoisted, {@code false} otherwise
   */
  boolean hoist();

  /**
   * Edits this role.
   *
   * @param edit the edit
   * @param <E> the edit type
   */
  <E extends Edit> void edit(final @NonNull E edit);

  /**
   * An edit.
   */
  interface Edit extends RolePartial {
  }
}
