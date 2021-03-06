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
package net.kyori.kassel.client;

import java.util.stream.Stream;
import net.kyori.kassel.Connectable;
import net.kyori.kassel.guild.Guild;
import net.kyori.kassel.snowflake.Snowflake;
import net.kyori.kassel.user.Activity;
import net.kyori.kassel.user.Status;
import net.kyori.kassel.user.User;
import net.kyori.mu.Maybe;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * A client.
 */
public interface Client extends Connectable {
  /**
   * Gets a stream of all guilds.
   *
   * @return a stream of all guilds
   */
  @NonNull Stream<Guild> guilds();

  /**
   * Gets a guild by its snowflake id.
   *
   * @param id the snowflake id
   * @return the guild
   */
  @NonNull Maybe<Guild> guild(final @Snowflake long id);

  /**
   * Gets a user by their snowflake id.
   *
   * @param id the snowflake id
   * @return the user
   */
  @NonNull Maybe<User> user(final @Snowflake long id);

  /**
   * Sets the status.
   *
   * @param status the status
   */
  void status(final @NonNull Status status);

  /**
   * Sets the activity.
   *
   * @param activityType the activity type
   * @param activityName the activity name
   */
  void activity(final @Nullable Activity activityType, final @Nullable String activityName);
}
