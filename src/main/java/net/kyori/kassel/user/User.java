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
package net.kyori.kassel.user;

import net.kyori.kassel.Mentionable;
import net.kyori.kassel.snowflake.Snowflaked;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Optional;

/**
 * A user.
 */
public interface User extends Mentionable, Snowflaked {
  /**
   * Gets the username.
   *
   * @return the username
   */
  @NonNull String username();

  /**
   * Gets the discriminator.
   *
   * @return the discriminator
   */
  @NonNull String discriminator();

  @Override
  default @NonNull String mention() {
    return "<@!" + this.id() + ">";
  }

  /**
   * Gets the avatar.
   *
   * @return the avatar
   */
  @NonNull Optional<String> avatar();

  /**
   * Checks if this user is a bot.
   *
   * @return {@code true} if this user is a bot, {@code false} otherwise
   */
  boolean bot();
}
